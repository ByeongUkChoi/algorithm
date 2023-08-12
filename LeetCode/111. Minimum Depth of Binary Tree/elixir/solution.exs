# Definition for a binary tree node.
#
# defmodule TreeNode do
#   @type t :: %__MODULE__{
#           val: integer,
#           left: TreeNode.t() | nil,
#           right: TreeNode.t() | nil
#         }
#   defstruct val: 0, left: nil, right: nil
# end

defmodule Solution do
  @spec min_depth(root :: TreeNode.t() | nil) :: integer
  def min_depth(root) do
    if root do
      find_depth(root, 0)
    else
      0
    end
  end

  defp find_depth(%{left: nil, right: nil}, depth) do
    depth + 1
  end

  defp find_depth(%{left: nil, right: right}, depth) do
    find_depth(right, depth + 1)
  end

  defp find_depth(%{left: left, right: nil}, depth) do
    find_depth(left, depth + 1)
  end

  defp find_depth(node, depth) do
    min(find_depth(node.left, depth + 1), find_depth(node.right, depth + 1))
  end
end
